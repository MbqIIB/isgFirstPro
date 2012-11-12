#!/bin/bash

/opt/mqm/bin/crtmqm -q CUST_QM
/opt/mqm/bin/strmqm CUST_QM
/opt/mqm/bin/runmqsc < iFrendCustQmgr.in
