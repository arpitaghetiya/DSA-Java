# Python Libraries Part 2

# collections

#counter is a subclass of dict that helps count hashable objects. It is an unordered collection where elements are stored as dictionary keys and their counts are stored as dictionary values. It is defined using the Counter() function from the collections module.
from collections import Counter

numbers = [1, 2, 2, 3, 3, 3, 4]

freq = Counter(numbers)

print(freq)
print(freq[3])
print(freq[5])

print(freq.most_common())
print(freq.most_common(2))


#defaultdict is a subclass of dict that provides a default value for the key that does not exist. It is defined using the defaultdict() function from the collections module.
from collections import defaultdict

groups = defaultdict(list)

groups["A"].append("Arpita")
groups["A"].append("Mima")
groups["B"].append("Vanu")

print(groups)
print(groups["A"])
print(groups["C"])


#deque is a double-ended queue that allows you to add or remove elements from both ends. It is defined using the deque() function from the collections module.
from collections import deque

dq = deque([1, 2, 3])

dq.append(4)
print(dq)

dq.appendleft(0)
print(dq)

dq.pop()
print(dq)

dq.popleft()
print(dq)

#heapq is a binary heap implementation that provides an efficient way to maintain a priority queue. It is defined using the heapq module.
import heapq
heap = [5, 2, 8, 1, 3]
heapq.heapify(heap)
print(heap)
heapq.heappush(heap, 0)
print(heap)
smallest = heapq.heappop(heap)
print(smallest)
print(heap)
print(heapq.heappop(heap))
print(heapq.heappop(heap))
print(heapq.heappop(heap))

heapq.heapify(numbers)
while numbers:
    print(heapq.heappop(numbers))
    
# bisect is a module that provides support for maintaining a list in sorted order without having to sort the list after each insertion. It is defined using the bisect module.
import bisect

numbers = [1, 3, 3, 5, 7]

print(bisect.bisect_left(numbers, 3))
print(bisect.bisect_right(numbers, 3))

bisect.insort(numbers, 4)
print(numbers)

#List Comprehension is a concise way to create lists in Python. It consists of an expression followed by a for clause, and can also include if clauses.
squares = []
for i in range(1, 6):
    squares.append(i * i)
print(squares)
squares = [i * i for i in range(1, 6)]
print(squares)

#zip is a built-in function that takes two or more iterables and returns an iterator that generates tuples containing elements from the input iterables. It is defined using the zip() function.
names = ["Arpita", "Mima", "Vanu"]
marks = [90, 85, 88]

for name, mark in zip(names, marks):
    print(name, mark)
    

#map is a built-in function that applies a given function to each item of an iterable (like a list) and returns an iterator that yields the results. It is defined using the map() function.
numbers = [1, 2, 3, 4, 5]
squares = list(map(lambda x: x * x, numbers))
print(squares)

#filter is a built-in function that constructs an iterator from elements of an iterable for which a function returns true. It is defined using the filter() function.
numbers = [1, 2, 3, 4, 5, 6]
even = list(filter(lambda x: x % 2 == 0, numbers))
print(even)
square = lambda x: x * x
print(square(5))

#any is a built-in function that returns True if any element of the iterable is true. If the iterable is empty, it returns False. It is defined using the any() function.
numbers = [1, 3, 5, 6]
print(any(x % 2 == 0 for x in numbers))

#all is a built-in function that returns True if all elements of the iterable are true. If the iterable is empty, it returns True. It is defined using the all() function.
numbers = [2, 4, 6, 8]
print(all(x % 2 == 0 for x in numbers))

numbers = [1, 3, 5, 6]
print(any(x % 2 == 0 for x in numbers))
print(all(x % 2 == 0 for x in numbers))