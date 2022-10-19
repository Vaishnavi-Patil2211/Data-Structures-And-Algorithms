function createNode(value) {
    return {
      value: value,
      next: null,
      previous: null,
    };
  }
  
  class DoublyLinkedList {
    constructor() {
      this.head = null;
      this.tail = null;
      this.length = 0;
    }
  
    insert(value) {
      this.length++;
      let newNode = createNode(value);
    
      if (this.tail) {
        // list is not empty
        this.tail.next = newNode;
        newNode.previous = this.tail;
        this.tail = newNode;
        return newNode;
      }
    
      this.head = this.tail = newNode;
      return newNode;
    }
    print() {
      let current = this.head;
      while (current) {
        console.log(
          `${current.previous?.value} ${current.value} ${current.next?.value}`
        );
        current = current.next;
      }
    }
  
    remove() {
      if (this.tail) {
        this.length--;
    
        const removedTail = this.tail;
    
        this.tail = this.tail.previous;
        if(this.tail){
          this.tail.next = null;
        } else {
          this.head = null;
        }
    
        return removedTail;
      }
      return undefined;
    }
  
  insertHead(value) {
    this.length++;
    let newNode = createNode(value);
  
    if (this.head) {
      this.head.previous = newNode;
      newNode.next = this.head;
      this.head = newNode;
      return newNode;
    }
  
    this.head = this.tail = newNode;
    return newNode;
  }
  removeHead() {
    if (this.head) {
      this.length--;
      const removedHead = this.head;
      this.head = this.head.next;
  
      if(this.head){
        this.head.previous = null;
      } else {
        this.tail = null;
      }
  
      return removedHead;
    }
    return undefined;
  }
  insertIndex(value, index) {
    if (index >= this.length) {
      throw new Error("Insert index out of bounds");
    }
  
    if (index === 0) {
      return this.insertHead(value);
    }
  
    this.length++;
    let currentNode = this.head;
    for (let i = 0; i < index; i++) {
      currentNode = currentNode.next;
    }
    const previousNode = currentNode.previous;
    const newNode = createNode(value);
    newNode.next = currentNode;
    newNode.previous = previousNode;
    previousNode.next = newNode;
    currentNode.previous = newNode;
    return newNode;
  }
  
  // remove at specific index
  
  removeIndex(index) {
    if (index >= this.length) {
      throw new Error("Remove index out of bounds");
    }
  
    if (index === 0) {
      return this.removeHead();
    }
  
    this.length--;
    let currentNode = this.head;
    for (let i = 0; i < index; i++) {
      currentNode = currentNode.next;
    }
    const previousNode = currentNode.previous;
    const nextNode = currentNode.next;
    previousNode.next = nextNode;
    nextNode.previous = previousNode;
    return currentNode;
  }
  
  
  
  }
  
  const dLinkedList = new DoublyLinkedList();
  
  dLinkedList.insert(7);
  dLinkedList.insert(8);
  dLinkedList.insert(6);
  dLinkedList.insert(5);
  dLinkedList.insert(4);
  
  dLinkedList.remove(4);
  
  dLinkedList.print(); 