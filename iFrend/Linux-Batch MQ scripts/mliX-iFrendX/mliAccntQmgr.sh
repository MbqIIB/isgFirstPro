#!/bin/bash

/opt/mqm/bin/crtmqm -q MLI_ACCNT_QM
/opt/mqm/bin/strmqm MLI_ACCNT_QM
/opt/mqm/bin/runmqsc < mliAccntQmgr.in
