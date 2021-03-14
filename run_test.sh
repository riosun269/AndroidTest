#!/usr/bin/env bash
# shellcheck disable=SC2046
rm -rf artifacts/*
echo ...remove all artifacts!
docker container rm $(docker container ls -a -q)
docker build -t riosun269/source-android .

# get artifact
IMAGE="riosun269/source-android"
CONTAINER="container_test"
echo killing all containers...
docker container rm $(docker container ls -a -q)
echo creating latest image
docker create --name $CONTAINER $IMAGE
#VAR=$(docker ps --format "{{.Names}}" -a)
docker cp $CONTAINER:/home/src/source/app/build/test-results/testDebugUnitTest/ artifacts/
docker cp $CONTAINER:/home/src/source/app/build/outputs/apk/debug/ artifacts/app/
docker cp $CONTAINER:/home/src/source/app/build/outputs/apk/androidTest/debug/ artifacts/instrumentation/
echo get artifacts done! Please check result above!!!