#!/bin/bash

/opt/mqm/bin/crtmqm -q WIN_MLI_APPLICATION_QM
/opt/mqm/bin/strmqm WIN_MLI_APPLICATION_QM
/opt/mqm/bin/runmqsc < mliAppQmgr.in
