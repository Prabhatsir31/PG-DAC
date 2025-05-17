import React from 'react'

const products = [
    { id: 1, title: 'Apple', isFruit: true },
    { id: 2, title: 'Banana', isFruit: true },
    { id: 3, title: 'Orange', isFruit: false },
    { id: 4, title: 'Mango', isFruit: true },
    { id: 5, title: 'Pineapple', isFruit: true },
    { id: 6, title: 'Grapes', isFruit: false },
    { id: 7, title: 'Strawberry', isFruit: false },
    { id: 8, title: 'Cherry', isFruit: false },
    { id: 9, title: 'Watermelon', isFruit: true },
    { id: 10, title: 'Pear', isFruit: false },
]
function ShoppingList() {
    const listitems = products.map((product, index) => 
        <li key={product.id} style={{color:product.isFruit ? 'magenta': 'darkgreen'
        }}>{product.title}</li>
    );

  return (
    <div>
        <ul>{listitems}</ul>
    </div>
  )
}

export default ShoppingList
