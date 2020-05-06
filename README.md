# Redis and Webflux

## Perf
```text
➜  ~ wrk -t12 -c200 -d30s http://127.0.0.1:8080/
Running 30s test @ http://127.0.0.1:8080/
  12 threads and 200 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     4.30ms    0.88ms  24.98ms   80.75%
    Req/Sec     3.74k   716.44     6.71k    86.23%
  1343077 requests in 30.11s, 106.31MB read
  Socket errors: connect 0, read 2, write 0, timeout 0
Requests/sec:  44612.52
Transfer/sec:      3.53MB
```

iMac(2019)