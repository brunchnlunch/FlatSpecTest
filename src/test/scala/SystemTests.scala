

class SystemTests extends TestBase {
  
  "The System" should "assign me an order" in {
    var orderID = OrderList.findNonAssignedOrder
    var orderExist = false
    for (a <- OrderList.Orders) {
      if (a.ID == orderID) {
        orderExist = true
      }
    }
    assert (orderExist == true)
  }
  
}