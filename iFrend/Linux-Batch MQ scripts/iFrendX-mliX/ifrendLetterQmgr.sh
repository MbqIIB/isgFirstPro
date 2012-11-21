#!/bin/bash

/opt/mqm/bin/crtmqm -q LETTER_QM
/opt/mqm/bin/strmqm LETTER_QM
/opt/mqm/bin/runmqsc < iFrendLetterQmgr.in
