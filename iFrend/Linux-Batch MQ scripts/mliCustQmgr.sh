#!/bin/bash

/opt/mqm/bin/crtmqm -q MLI_CUST_QM
/opt/mqm/bin/strmqm MLI_CUST_QM
/opt/mqm/bin/runmqsc < mliCustQmgr.in
