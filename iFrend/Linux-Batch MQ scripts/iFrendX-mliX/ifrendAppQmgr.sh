#!/bin/bash

/opt/mqm/bin/crtmqm -q APP_QM
/opt/mqm/bin/strmqm APP_QM
/opt/mqm/bin/runmqsc < iFrendAppQmgr.in
