#!/bin/bash

/opt/mqm/bin/crtmqm -q APPLICATION_QM
/opt/mqm/bin/strmqm APPLICATION_QM
/opt/mqm/bin/runmqsc < ifrendAppQmgr.in
