
function appendToDisplay(value) {
    document.getElementById('display').value += value;
}

function calculate() {
    const expression = document.getElementById('display').value;
    try {
      const result = eval(expression);
      document.getElementById('display').value = result;
    } catch (error) {
      document.getElementById('display').value = 'Invalid Expression';
    }
  }

function clearDisplay() {
    document.getElementById('display').value = '';
  }