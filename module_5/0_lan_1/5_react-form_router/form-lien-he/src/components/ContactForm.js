import { Formik } from 'formik';
import { useState } from 'react';
import '../App.css';

export function ContactForm() {
    const [form, setForm] = useState({});
    const REGEX = {
        email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/
    };

    function handleChange(event) {
        setForm({
            ...form,
            [event.target.name]: event.target.value
        });
    }

    const handleValidate = () => {
        const errors = {};
        if (!form.name) {
            errors.name = "Required";
        }
        if (!form.email) {
            errors.email = "Required";
        } else if (!REGEX.email.test(form.email)) {
            errors.email = "Invalid email address";
            console.log("code");
        }
        if (!form.phone) {
            errors.phone = "Required";
        }
        return errors;
    }

    function handleSubmit() {
        alert("Add contact successfully!!!");
    }

    return (
        <div className='contact-form'>
            <Formik
                initialValues={form}
                validate={handleValidate}
                onSubmit={handleSubmit}
            >
                {({ errors, handleSubmit }) => (
                    <form>
                        <table>
                            <thead>
                                <tr>
                                    <th>Contact form</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th>
                                        <label htmlFor='name'>Name</label>
                                    </th>
                                    <td>
                                        <input
                                            type='text'
                                            name='name'
                                            value={form.name || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.name}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <label htmlFor='email'>Email</label>
                                    </th>
                                    <td>
                                        <input
                                            type='text'
                                            name='email'
                                            value={form.email || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.email}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <label htmlFor='phone'>Phone</label>
                                    </th>
                                    <td>
                                        <input
                                            type='text'
                                            name='phone'
                                            value={form.phone || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.phone}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <label htmlFor='message'>Message</label>
                                    </th>
                                    <td>
                                        <textarea
                                            type='text'
                                            name='message'
                                            value={form.message || ''}
                                            onChange={handleChange} />
                                    </td>
                                </tr>
                                <tr>
                                    <th>
                                        <button type='submit' onClick={handleSubmit}>Submit</button>
                                    </th>
                                </tr>
                            </tbody>
                        </table>
                    </form>
                )}
            </Formik>
        </div>
    );
}