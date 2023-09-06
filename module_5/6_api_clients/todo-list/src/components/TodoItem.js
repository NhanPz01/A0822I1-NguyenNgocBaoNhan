export function TodoItem() {
    return (
        <>
            <li className="list-group-item border-0 d-flex align-items-center ps-0">
                <input className="form-check-input me-3" type="checkbox" value="" aria-label="..." checked />
                <s>Task list and assignments</s>
            </li>
        </>
    );
}