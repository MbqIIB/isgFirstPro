#!/bin/bash

/opt/mqm/bin/crtmqm -q WIN_MLI_CARD_QM
/opt/mqm/bin/strmqm WIN_MLI_CARD_QM
/opt/mqm/bin/runmqsc < mliCardQmgr.in
