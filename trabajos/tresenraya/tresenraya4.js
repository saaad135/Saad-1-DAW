let currentPlayer = 'X';
const cells = document.querySelectorAll('.cell');

function makeMove(cellIndex) {
  if (!cells[cellIndex].textContent) {
    cells[cellIndex].textContent = currentPlayer;
    cells[cellIndex].classList.add(currentPlayer);
    if (checkWin()) {
      setTimeout(() => {
        alert('¡' + currentPlayer + ' ha ganado!');
        resetBoard();
      }, 100); // Retraso para mostrar el último movimiento antes de mostrar la alerta
    } else if (checkDraw()) {
      setTimeout(() => {
        alert('¡Empate!');
        resetBoard();
      }, 100);
    } else {
      currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
    }
  }
}

function checkWin() {
  const winningCombos = [
    [0, 1, 2], [3, 4, 5], [6, 7, 8],
    [0, 3, 6], [1, 4, 7], [2, 5, 8],
    [0, 4, 8], [2, 4, 6]
  ];
  return winningCombos.some(combo => {
    return cells[combo[0]].textContent &&
      cells[combo[0]].textContent === cells[combo[1]].textContent &&
      cells[combo[1]].textContent === cells[combo[2]].textContent;
  });
}

function checkDraw() {
  return [...cells].every(cell => cell.textContent);
}

function resetBoard() {
  cells.forEach(cell => {
    cell.textContent = '';
    cell.classList.remove('X', 'O');
  });
  currentPlayer = 'X';
}

