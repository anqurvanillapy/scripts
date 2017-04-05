#!/usr/bin/env clojure

(defn hexdumpc
  "A Clojure alternative of `hexdump -C'"
  [rs]
  (loop [i 0]
    (let [rsiz (count rs)]
      ;; Truncate the raw string into 16-sized pieces.
      (if-let [buf (not-empty (subs rs
                                    (min i rsiz)
                                    (->> i (- rsiz) (min 16) (+ i))))]
        (do
          (print (format "%08x  " i))
          (let [bsiz (count buf)
                ;; Split a buffer into two, even if it might be shorter than 8.
                sbuf0 (subs buf 0 (min bsiz 8))
                sbuf1 (if (> bsiz 8)
                             (subs buf 8 (-> bsiz (- 8) (min 8) (+ 8)))
                             "")]
            ;; Turn the buffer into a hex string.
            (doseq [item (map (fn [ss] (->> ss
                                            (.getBytes)
                                            (map #(format "%02x " %))
                                            (apply str)))
                              [sbuf0 sbuf1])]
                  (do
                    (print (format "%-24s" item))
                    (print " "))))
          ;; Only printable charascters could be displayed, otherwise replace
          ;; them with dots.
          (println (format "|%s|" (->> buf
                                       (map #(let [c (int %)]
                                               (if (and (>= c 32) (<= c 126))
                                                   %
                                                   \.)))
                                       (apply str))))
          (recur (+ i 16)))
        ;; Handle the last buffer for indicating the tail's size.
        (println (format "%08x" (->> i (- rsiz) (+ i))))))))


;; slurp doesn't read from *in* lazily and returns a string.
(hexdumpc (slurp *in*))
