import React from "react";

export default function NavBar() {
    return (
        <>
            <nav className="navbar navbar-expand navbar-dark bg-dark">
                <a className="navbar-brand" href="/">Books Management</a>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample02"
                        aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <div className="collapse navbar-collapse" id="navbarsExample02">
                    <a href="/new">
                        <button className="btn btn-success">Add new</button>
                    </a>
                </div>
            </nav>
        </>
    )
}