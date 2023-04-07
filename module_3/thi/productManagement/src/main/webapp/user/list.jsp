<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 03-Apr-23
  Time: 6:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</head>
<style>
    :root {
        --pink-color: #e26e70;
    }

    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        height: 100vh;
        overflow: hidden;
    }

    .open-modal-btn {
        padding: 20px 40px;
        border: none;
        outline: none;
        border-radius: 5px;
        position: relative;
    }

    .modal {
        position: fixed;
        top: 0;
        height: 100vh;
        width: 100vw;
        background: rgba(0, 0, 0, 0.6);
    }

    .modal__inner {
        width: 400px;
        position: relative;
        top: 50%;
        margin: auto;
        background: white;
        border-radius: 5px;
        overflow: hidden;
    }

    .modal__header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 15px;
        background-color: var(--pink-color);
        color: white;
    }

    .modal__body {
        padding: 15px;
    }

    .modal__body th {
        color: var(--pink-color);
        margin-right: 10px;
    }

    .modal__footer {
        padding: 15px;
        text-align: center;
    }

    .modal__footer button {
        padding: 10px 20px;
        color: white;
        background: var(--pink-color);
        border: none;
        outline: none;
        cursor: pointer;
        border-radius: 5px;
    }

    .hide {
        display: none;
    }
</style>
<body>
<div class="modal hide">
    <div class="modal__inner">
        <div class="modal__header">
            <p>Add new Produdct</p>
            <button style="cursor: pointer; overflow: hidden">X</button>
        </div>
        <div class="modal__body">
            <form method="post">
                <table cellpadding="5">
                    <tr>
                        <th>Name</th>
                        <td>
                            <input type="text" name="name"
                                   value="<c:out value='${product.name}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Price</th>
                        <td>
                            <input type="number" name="price"
                                   value="<c:out value='${product.price}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Quantity</th>
                        <td>
                            <input type="number" name="quantity"
                                   value="<c:out value='${product.quantity}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Color</th>
                        <td>
                            <input type="text" name="color"
                                   value="<c:out value='${product.color}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Description</th>
                        <td>
                            <input type="text" name="description"
                                   value="<c:out value='${product.description}' />"
                            />
                        </td>
                    </tr>
                    <tr>
                        <th>Category</th>
                        <td>
                            <select name="category_id">
                                <c:forEach items="${listCategory}" var="category">
                                    <option value="${category.id}">
                                        <c:out value="${category.name}"></c:out>
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </table>
                <div class="modal__footer">
                    <input type="submit" value="Save" style="padding: 10px 20px; color: white; background: var(--pink-color); border: none;
        outline: none;
        cursor: pointer;
        border-radius: 5px;"/>
                    <button>Back</button>
                </div>
            </form>
        </div>

    </div>
</div>
<h3>Management Product</h3>
<h3>
    <a href="/product?action=create">
        <button class="open-modal-btn">Add Products</button>
    </a>
    <br>
    <a href="/product">Tải lại</a>
</h3>
    <form action="/product?action=search" method="get">
    <h3>Find Product</h3>
    <table>
        <tr>
            <th>Product Name</th>
            <th>Price</th>
            <th>Category</th>
            <th>Color</th>
            <th>Clear</th>
            <th></th>
        </tr>
        <tr>
            <td>
                <input type="text" name="name" size="25"
                       placeholder="Enter Product Name"
                />
            </td>
            <td>
                <input type="text" name="price" size="25"
                       placeholder="Enter Price"
                />
            </td>
            <td>
                <input type="text" name="category" size="25"
                       placeholder="Enter Category"
                />
            </td>
            <td>
                <input type="text" name="color" size="25"
                       placeholder="Enter Color"
                />
            </td>
            <td>
                <a href="/product">Clear</a>
            </td>
            <td>
                <input type="submit" value="search" name="action"/>
            </td>
        </tr>
    </table>
</form>

<div align="center">
    <table border="1" cellpadding="5">
        <tr>
            <th>STT</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Color</th>
            <th>Category</th>
            <th></th>
        </tr>
        <c:forEach items="${listProduct}" var="product">
            <tr>
                <td><c:out value="${product.id}"/></td>
                <td><c:out value="${product.name}"/></td>
                <td><c:out value="${product.price}"/></td>
                <td><c:out value="${product.quantity}"/></td>
                <td><c:out value="${product.color}"/></td>
                <td><c:out value="${product.category.name}"/></td>
                <td>
                    <a href="/product?action=edit&id=${product.id}">Edit</a>
                </td>
                <td>
                    <button type="button" onclick="deleteInfo('${product.id}','${product.name}')"
                            class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#deleteModal">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

<%--<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>--%>
<%--                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--            </div>--%>
<%--            <form action="/product?action=delete" method="post">--%>
<%--                <div class="modal-body">--%>
<%--                    <input name="deleteId" id="deleteId" hidden>--%>
<%--                    <span>Bạn có muốn xoá </span><span style="color: #ff0000" id="deleteName"></span><span> không?</span>--%>
<%--                </div>--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>--%>
<%--                    <button type="submit" class="btn btn-primary " data-bs-target="noticeDeleteModal"--%>
<%--                            data-bs-toggle="modal"> Delete--%>
<%--                    </button>--%>
<%--                </div>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
</body>
<script>
    function deleteInfo(id, name) {
        document.getElementById("deleteName").innerText = name;
        document.getElementById("deleteId").value = id;
    }
</script>
</html>
