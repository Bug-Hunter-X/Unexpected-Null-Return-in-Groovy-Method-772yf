```groovy
def myMethod(a, b) {
  // Use Groovy's elvis operator for concise null handling
  a = a ?: 0 //If a is null set a to 0
  b = b ?: 0 //If b is null set b to 0
  return a + b
}

println myMethod(1, 2) // Output: 3
println myMethod(null, 2) // Output: 2
println myMethod(1, null) // Output: 1
println myMethod(null, null) // Output: 0
```