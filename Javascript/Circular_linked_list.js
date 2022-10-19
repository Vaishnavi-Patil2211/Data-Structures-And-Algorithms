function CircularLinkedList(){
  this.head = null;
}


CircularLinkedList.prototype.push = function(val){
   var head = this.head,
       current = head,
       node = {value: val, next: null, previous: null};

   if(!head){
      node.next = node;
      node.previous = node;
      this.head = node;
   }
   else{
      while(current.next != head){
         current = current.next;
      }

      node.next = head;
      node.previous = current;

      head.previous = node;
      current.next = node;
   }
}


var cll = new CircularLinkedList();
cll.push(3);
cll.push(4);
cll.push(5);
