#!/bin/bash

/opt/mqm/bin/crtmqm -q MLI_TXN_QM
/opt/mqm/bin/strmqm MLI_TXN_QM
/opt/mqm/bin/runmqsc < mliTxnQmgr.in
