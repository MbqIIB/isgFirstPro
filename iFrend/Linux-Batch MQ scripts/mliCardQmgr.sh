#!/bin/bash

/opt/mqm/bin/crtmqm -q MLI_CARD_QM
/opt/mqm/bin/strmqm MLI_CARD_QM
/opt/mqm/bin/runmqsc < mliCardQmgr.in
