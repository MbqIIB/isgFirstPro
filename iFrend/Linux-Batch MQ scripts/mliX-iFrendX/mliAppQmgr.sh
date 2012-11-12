#!/bin/bash

/opt/mqm/bin/crtmqm -q MLI_APP_QM
/opt/mqm/bin/strmqm MLI_APP_QM
/opt/mqm/bin/runmqsc < mliAppQmgr.in

