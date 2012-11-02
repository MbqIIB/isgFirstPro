#!/bin/bash

/opt/mqm/bin/crtmqm -q MLI_APPLICATION_QM
/opt/mqm/bin/strmqm MLI_APPLICATION_QM
/opt/mqm/bin/runmqsc < mliAppQmgr.in
