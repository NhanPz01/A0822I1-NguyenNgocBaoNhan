import React from 'react';
import { Nav, Navbar, Container } from 'react-bootstrap';

export default function NavBar() {
    return (
        <Navbar bg="dark" variant="dark" expand="lg">
            <Container>
                <Navbar.Brand href="/">Home</Navbar.Brand>
                <Navbar.Toggle aria-controls="navbar-nav" />
                <Navbar.Collapse id="navbar-nav">
                    {/*<Nav className="me-auto">*/}
                    {/*    <Nav.Link href="/">Service</Nav.Link>*/}
                    {/*    <Nav.Link href="/customer">Customer</Nav.Link>*/}
                    {/*    <Nav.Link href="/contract">Contract</Nav.Link>*/}
                    {/*</Nav>*/}
                    <Nav className="ml-auto">
                        <Nav.Link href="#">
                            <input className="form-control" type="text" placeholder="Search" aria-label="Search" />
                        </Nav.Link>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
    );
}

