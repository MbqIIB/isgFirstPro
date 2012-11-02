#!/bin/bash

/opt/mqm/bin/crtmqm -q TXN_QM
/opt/mqm/bin/strmqm TXN_QM
/opt/mqm/bin/runmqsc < ifrendTxnQmgr.in
