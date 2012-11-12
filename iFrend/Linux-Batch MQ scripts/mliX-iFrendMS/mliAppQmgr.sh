#!/bin/bash

/opt/mqm/bin/crtmqm -q WIN_MLI_APP_QM
/opt/mqm/bin/strmqm WIN_MLI_APP_QM
/opt/mqm/bin/runmqsc < mliAppQmgr.in
