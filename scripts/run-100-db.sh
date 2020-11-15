#!/bin/bash

# Build a new database
sqlite3 adstxt.db < ./sql/create.sql


rm -f error.log


java -jar ./target/uberjar/adstxt-crawler-standalone.jar -t ./doc/top-100-programmatic-domains.txt -d adstxt.db 2>error.log

# Show results
echo 'select * from adstxt;' | sqlite3 adstxt.db
echo "done"



