import heapq

# Read input
N, M = map(int, input().split())

# Initialize adjacency list and visited array
adj = [[] for i in range(N)]
visited = [False] * N

for i in range(M):
    u, v, l, c = map(int, input().split())
    u -= 1
    v -= 1
    adj[u].append((v, l, c))
    adj[v].append((u, l, c))

# Dijkstra's algorithm
pq = []
heapq.heappush(pq, (0, 0))
cost = [float('inf')] * N
cost[0] = 0

while pq:
    c, u = heapq.heappop(pq)
    if visited[u]:
        continue
    visited[u] = True
    for v, l, c2 in adj[u]:
        if not visited[v]:
            new_cost = cost[u] + c2
            if new_cost < cost[v]:
                cost[v] = new_cost
                heapq.heappush(pq, (new_cost, v))

# Output answer
total_cost = sum(c for _, _, c in adj[0])
for u in range(1, N):
    for v, l, c in adj[u]:
        if cost[u] + l <= cost[v]:
            print(c)
            total_cost += c

print(total_cost)
