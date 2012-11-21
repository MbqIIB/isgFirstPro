#!/bin/bash

/opt/mqm/bin/crtmqm -q MLI_LETTER_QM
/opt/mqm/bin/strmqm MLI_LETTER_QM
/opt/mqm/bin/runmqsc < mliLetterQmgr.in

