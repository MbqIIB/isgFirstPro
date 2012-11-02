#!/bin/bash

/opt/mqm/bin/crtmqm -q WIND_MLI_ACCNT_QM
/opt/mqm/bin/strmqm WIN_MLI_ACCNT_QM
/opt/mqm/bin/runmqsc < mliAccntQmgr.in
