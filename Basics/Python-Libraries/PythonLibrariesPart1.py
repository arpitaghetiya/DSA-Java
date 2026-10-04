#Python Libraries Part 1
#lists are ordered collections of elements. They are defined using square brackets [].
my_list=[10, 20, 30, 40, 50]

print(my_list[2])

my_list.append(60)
print(my_list)

my_list.remove(20)
print(my_list)

my_list[2]=35
print(my_list)

print(len(my_list))

my_list.sort()
print(my_list)

my_list.reverse()
print(my_list)

print(my_list[1:3])
print(my_list[1:])

#sets are unordered collections of unique elements. They are defined using curly braces {}.
my_set={1, 2, 3, 3, 5}
print(my_set)

my_set.add(6)
print(my_set)

my_set.remove(2)
print(my_set)

print(3 in my_set)

set1={1, 2, 3}
set2={3, 4, 5}

print(set1.union(set2))
print(set1.intersection(set2))
print(set1.difference(set2))
print(set1.symmetric_difference(set2))
print(set1.issubset(set2))
print(set1.issuperset(set2))
print(set1.isdisjoint(set2))
print(set1.copy())
print(set1.clear())
print(set1)

#Dictionaries are mutable, meaning you can change their values after they are created. They are defined using curly braces {}.
my_dict = {"name": "Arpita", "age": 20, "course": "CSE"}
print(my_dict)
print(my_dict["name"])
my_dict["city"] = "Banglore"
print(my_dict)

my_dict["age"] = 21
print(my_dict)

del my_dict["course"]
print(my_dict)

print("name" in my_dict)
print(20 in my_dict)

print(my_dict.keys())
print(my_dict.values())
print(my_dict.items())

#tuples are immutable, meaning you cannot change their values after they are created. They are defined using parentheses ().
mytuple=("apple", "banana", "cherry")
print(mytuple)

print(mytuple[1])

print(len(mytuple))
print(mytuple.count("apple"))

print(mytuple.index("cherry"))

#Built-in functions
numbers=[1, 2, 3, 4, 5]
print(sum(numbers))
print(max(numbers))
print(min(numbers))
print(sorted(numbers))
print(list(reversed(numbers)))
print(abs(-25))
print([*range(1, 6)])
print(list(range(1, 6)))
print(list(range(0, 10, 2)))
for index, value in enumerate(numbers):
    print(index, value)