var inputSentence = "This is a sunny day";
var reversedSentence = "";

function reverseSentence(sentenec) {
  var words = sentenec.split(" ");

  for (word of words) {
    let reversedWord = "";
    for (let i = word.length - 1; i >= 0; i--) {
      reversedWord += word[i];
    }

    reversedSentence += reversedWord + " ";
  }

}

reverseSentence(inputSentence);

console.log("Original Sentence : ",inputSentence);
console.log("Reversed Sentence : ",reversedSentence);

