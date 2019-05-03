#!/bin/bash -e

cd $WORKSPACE

mvn -Dmaven.test.failure.ignore clean package

echo "Build completed"