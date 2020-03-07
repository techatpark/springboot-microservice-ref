#!/bin/bash

set -e
set -u

function create_user_and_database() {
	local database=$1
	echo "  Creating user and database '$database'"
	mysql -uroot -p$MYSQL_ROOT_PASSWORD <<-EOSQL
		CREATE USER '$database'@'%' IDENTIFIED BY '$database';
		CREATE DATABASE $database;
		GRANT ALL PRIVILEGES ON $database.* TO '$database'@'%';
EOSQL
}

if [ -n "$MULTIPLE_DATABASES" ]; then
	echo "Multiple database creation requested: $MULTIPLE_DATABASES"
	for db in $(echo $MULTIPLE_DATABASES | tr ',' ' '); do
		create_user_and_database $db
	done
	echo "Multiple databases created"
fi