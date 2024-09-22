This is a server that contains ip addresses of all inventory services.
whenever an inventory service starts, it registers with this server.

When a client request for inventory, it sends a request to this server.
The server gives ip addresses of all the inventory services.

The client can then check with one of these if products are in stock or not.

### why we need this
we need a discovery server because in prod environment, ip addresses are dynamic and there
will be multiple servers. Before putting an order, we were just checking with localhost and getting
stock info but in prod environment, inventory services will have dynamic ip.

### client side
whenever a client makes request to discovery service, it stores the ip addresses in local cache
so even if discovery server is offline, client can get ip from local cache try requests.