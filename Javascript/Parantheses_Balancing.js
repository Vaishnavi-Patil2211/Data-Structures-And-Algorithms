class Stack {
    constructor() {
        this.items = []
        this.top = null
    }
getTop() {
        if (this.items.length == 0)
            return null
        return this.top
    }
    isEmpty() {
        return this.items.length == 0
    }
    size() {
        return this.items.length
    }
    push(element) {
        this.items.push(element)
        this.top = element
    }
    pop() {
        if (this.items.length != 0) {
            if (this.items.length == 1) {
                this.top = null
                return this.items.pop()
            } else {
                this.top = this.items[this.items.length - 2]
                return this.items.pop()
            }
    } else
            return null
    }
}
isBalancedParantheses(exp) => {
    let myStack = new Stack()


    for (let i = 0 i < exp.length i++) {
        
        if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
            if (myStack.isEmpty()) return false
            let output = myStack.pop()

        if (((exp[i] == "}") && (output != "{")) || ((exp[i] == ")") && (output != "(")) || ((exp[i] == "]") && (output != "["))) {
                return false
            }
        } else {

            myStack.push(exp[i])
        }
}

if (myStack.isEmpty() == false) {
        return false
    }
return true
}
let firstInputData = "{[({})]}"
console.log(isBalancedParantheses(firstInputData))
secondInputData = "{[({})}"
console.log(isBalancedParantheses(secondInputData))
