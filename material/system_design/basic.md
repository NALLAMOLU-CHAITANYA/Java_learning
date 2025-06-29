

System Design is the process of defining the architecture, components, modules, interfaces, and data for a system to satisfy specific requirements. In interviews and real-world scenarios, it involves designing scalable, maintainable, and efficient software systems.

# High-Level Design
-> Break system into major components (e.g., Web Server, Application Server, DB, Cache)
-> Define data flow
-> Use load balancers, CDNs, etc.

# Low-Level Design
-> Object-oriented design of modules (classes, functions, database schema)
-> Interaction between components

1. HLD:
   - Web architecture basics (client-server, APIs)
   - Load balancers, caching, database choices
   - Scalability (horizontal vs vertical)
   - CAP theorem, consistency, availability
   - Designing systems like Instagram, YouTube, etc.

2. LLD:
   - Class diagrams, OOP principles (SOLID)
   - Design patterns (Factory, Singleton, Strategy, etc.)
   - Schema design, relationships
   - Implementation-level decisions


# Key Topics

| Category            | Concepts                                                        |
| ------------------- | --------------------------------------------------------------- |
| **Basics**          | Client-server model, API (REST, gRPC), CRUD services            |
| **Scalability**     | Load balancing, horizontal vs vertical scaling                  |
| **Databases**       | RDBMS vs NoSQL, indexing, replication, sharding                 |
| **Caching**         | Redis/Memcached, Cache eviction policies (LRU, LFU, TTL)        |
| **Messaging**       | Asynchronous systems, message queues (Kafka, RabbitMQ, SQS)     |
| **Storage**         | Object storage (S3), blob stores, file systems                  |
| **CDN**             | Caching static files closer to users (e.g., Cloudflare, Akamai) |
| **Design Patterns** | Circuit breaker, rate limiting, throttling                      |
| **Consistency**     | CAP Theorem, Eventual consistency, Strong vs Weak consistency   |
| **Monitoring**      | Logging, metrics, alerting (ELK stack, Prometheus + Grafana)    |
| **Security**        | Authentication (OAuth, JWT), HTTPS, CORS                        |



| Problem                      | What You Might Design                       |
| ---------------------------- | ------------------------------------------- |
| Design a URL shortener       | Like bit.ly – hash functions, DB, redirects |
| Design an Instagram-like app | Image upload, feed generation, scalability  |
| Design a rate limiter        | Sliding window, token bucket algorithm      |
| Design an e-commerce site    | Cart, product catalog, orders, payments     |



# How to Approach a System Design Question (Interview) :
**Clarify Requirements** – Functional and non-functional
**Define API endpoints** – What actions the system performs
**High-Level Components**– Web servers, databases, caches
**Deep Dive** – Focus on database schema, consistency, scaling
**Bottlenecks** – Identify SPOFs (single points of failure) and mitigate
**Trade-offs** – CAP theorem, cost vs performance, consistency vs availability


📚 Recommended Resources
**Books:**

Designing Data-Intensive Applications by Martin Kleppmann

System Design Interview by Alex Xu (Vol 1 and 2)

**YouTube Channels:**

System Design Primer – Tech Dummies, Gaurav Sen

Hussein Nasser – Great for backend and distributed systems

**Practice Sites:**

Excalidraw – Whiteboarding

SystemDesignPrimer