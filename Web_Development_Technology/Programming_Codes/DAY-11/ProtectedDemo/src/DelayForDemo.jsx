// Add a fixed delay so you can see the loading state

async function DelayForDemo(promise) {
    await new Promise((resolve) => {
        setTimeout(resolve, 2000);
    });
    return promise;
  }


  export default DelayForDemo