#!/bin/bash
sbt \
  clean \
  ++2.12.15 \
  plugin/publishSigned \
  clean \
  ++2.13.6 \
  plugin/publishSigned \
  sonatypeRelease
