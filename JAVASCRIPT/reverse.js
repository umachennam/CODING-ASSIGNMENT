// var str = "This Sentence is for JavaScript Assignment"

var str ="This is a sunny day"  // Input Sentence
let splited_str = str.split(" ") // Spliting the array
let reversed_string=[] // to store the reversed words from the sentence.

// Function for reversing a word from the sentence.
const reverseOperation= (val)=>{
    let new_word = ""
    for(let i =val.length-1;i>=0;i--){
        new_word+=val[i]
    }
    return new_word
}

for(val in splited_str){
    reversed_string.push(reverseOperation(splited_str[val]))
}

reversed_string=reversed_string.join(" ")
console.log(reversed_string)