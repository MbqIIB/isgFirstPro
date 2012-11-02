#!/bin/bash

/opt/mqm/bin/crtmqm -q WIN_MLI_TXN_QM
/opt/mqm/bin/strmqm WIN_MLI_TXN_QM
/opt/mqm/bin/runmqsc < mliTxnQmgr.in
