#!/bin/bash

/opt/mqm/bin/crtmqm -q WIN_MLI_ACCNT_QM
/opt/mqm/bin/strmqm WIN_MLI_ACCNT_QM
/opt/mqm/bin/runmqsc < mliAccntQmgr.in
