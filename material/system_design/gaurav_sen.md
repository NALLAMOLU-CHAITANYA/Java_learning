
## What is system design? (Explanation in doc)
1.	Vertical scaling
2.	Preprocessing (making it ready in low demand hrs)
3.	Backups
4.	Horizontal scaling
5.	Micro services Architecture (specific request to specific agent)
6.	Distributed systems (partitioning) 
7.	Load balancing.
8.	Decoupling.
9.	Metrics.
10.	Extensibility.


## Basics:

1. Scaling : vertical scaling(bigger machine) and horizontal scaling(more machines)

Differences:

| Horizontal scaling                                       |      Vertical scaling              |
|__________________________________________________________|____________________________________|
| Load balancing required.                                 |      N/A                           |
| Resilient                                                |      Single point of failure       |
| network calls (RPC) (for communication b/w processes)    |      Interprocess communication    |
| Data inconsistency.                                      |      Consistent                    |
| scales well as users increase.                           |      Hardware limit                |


2. Capacity planning and estimation: main topic in doc


