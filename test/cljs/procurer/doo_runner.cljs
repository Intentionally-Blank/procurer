(ns procurer.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [procurer.core-test]))

(doo-tests 'procurer.core-test)

