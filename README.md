# Groovy Null Handling Bug

This repository demonstrates a common issue in Groovy related to null handling and loose typing. The `myMethod` function returns `null` if either of its arguments are `null`.  This seemingly innocuous behavior can lead to hard-to-debug `NullPointerExceptions` further down the call stack if not explicitly checked for.

The `bug.groovy` file showcases the problematic code. The `bugSolution.groovy` file provides a corrected version with improved null handling.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe the output, noting the unexpected `null` returns.
4. Examine `bugSolution.groovy` to see how the issue is resolved.

## Solution
The solution involves adding explicit null checks and handling, or using Groovy's optional features to gracefully handle potential `null` values.