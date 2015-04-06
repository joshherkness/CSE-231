# BinaryTreeMW.java

*By* **Joshua Herkness**
*And* **Trevor Luebbert**

## How to use

```java
BinaryTreeMW binaryTreeMiddleware = new BinaryTreeMW();
binaryTreeMiddleware.populateBinaryTreeDB(400000);
```

Or


```java
BinaryTreeMW binaryTreeMiddleware = new BinaryTreeMW(400000);
```

## Methods

### Public

- `public BinaryTreeMW()`
- `public BinaryTreeMW(int size)`
- `public void populateBinaryTreeDB(int size)`
- `public String calculatePreorderNodesSearched(int key1, int key2, int key3)`
- `public String calculateInOrderNodesSearched(int key1, int key2, int key3)`
- `public String calculatePreorderSearchDuration(int key1, int key2, int key3)`
- `public String calculateInOrderSearchDuration(int key1, int key2, int key3)`
- `public String calculateBigORelationship()`
- `public BinaryTreeDB getBinaryTreeDatabase()`

### Private 

- `private int calculatePreorderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key)`
- `private int calculatePreorderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key, boolean continueSearching)`
- `private int calculateInOrderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key)`
- `private int calculateInOrderNodesSearched(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key, boolean continueSearching)`
- `private double calculatePreorderSearchDuration(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key)`
- `private double calculateInOrderSearchDuration(BinaryTreeDB binaryTreeDatabase, Node focusNode, int key)`
- `private String calculateInOrderTimeElapsed(Node focusNode, int key, boolean continueSearching)`
- `private List<Integer> createNonDuplicateRandomNumbers(int minimumValue, int maximumValue, int size)`