import { Formik } from 'formik';
import { useState } from 'react';
import '../App.css';

export function MedicalForm() {
    const [form, setForm] = useState({});
    const REGEX = {
        email: /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/
    };
    const SEX_LIST = [
        {
            label: 'Nam',
            value: 'male'
        },
        {
            label: 'Nữ',
            value: 'female'
        }
    ]

    function handleChange(event) {
        const value = event.target.type === 'checkbox' ? !form[event.target.name] : event.target.value
        setForm({
            ...form,
            [event.target.name]: value
        });
    }

    const handleValidate = () => {
        const errors = {};
        if (!form.name) {
            errors.name = "Required";
        }
        if (!form.person_id) {
            errors.person_id = "Required";
        }
        if (!form.year_of_birth) {
            errors.year_of_birth = "Required";
        } else if (form.year_of_birth <= 1900) {
            errors.year_of_birth = "Must greater than 1900";
        }
        if (!form.country) {
            errors.country = "Required";
        }
        if (!form.province) {
            errors.province = "Required";
        }
        if (!form.district) {
            errors.district = "Required";
        }
        if (!form.ward) {
            errors.ward = "Required";
        }
        if (!form.phone) {
            errors.phone = "Required";
        }
        if (!form.email) {
            errors.email = "Required";
        } else if (!REGEX.email.test(form.email)) {
            errors.email = "Invalid email address";
        }
        return errors;
    }

    function handleSubmit() {
        alert("Add contact successfully!!!");
    }

    return (
        <div className='medical-form'>
            <Formik
                initialValues={form}
                validate={handleValidate}
                onSubmit={handleSubmit}
            >
                {({ errors, handleSubmit }) => (
                    <form>
                        <h1>Tờ khai y tế</h1>
                        <table>
                            <tbody>
                                <tr>
                                    <td>
                                        <label htmlFor='name'>Họ và tên</label>
                                    </td>
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
                                    <td>
                                        <label htmlFor='person_id'>Số hộ chiếu/ CMND</label>
                                    </td>
                                    <td>
                                        <input
                                            type='text'
                                            name='person_id'
                                            value={form.person_id || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.person_id}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='year_of_birth'>Năm sinh</label>
                                    </td>
                                    <td>
                                        <input
                                            type='number'
                                            name='year_of_birth'
                                            value={form.year_of_birth || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.year_of_birth}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='gender'>Giới tính</label>
                                    </td>
                                    <td>
                                        <input
                                            type='radio'
                                            name='gender'
                                            value={'Nam'}
                                            checked
                                            onChange={handleChange} /> Nam
                                        <input
                                            type='radio'
                                            name='gender'
                                            value={'Nữ'}
                                            onChange={handleChange} /> Nữ
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='country'>Quốc tịch</label>
                                    </td>
                                    <td>
                                        <input
                                            type='text'
                                            name='country'
                                            value={form.country || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.country}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='company'>Công ty làm việc</label>
                                    </td>
                                    <td>
                                        <input
                                            type='text'
                                            name='company'
                                            value={form.company || ''}
                                            onChange={handleChange} />
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='department'>Bộ phận làm việc</label>
                                    </td>
                                    <td>
                                        <input
                                            type='text'
                                            name='department'
                                            value={form.department || ''}
                                            onChange={handleChange} />
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='healtd_insurance'>Có thẻ bảo hiểm y tế</label>
                                    </td>
                                    <td>
                                        <input
                                            type='checkbox'
                                            name='healtd_insurance'
                                            value={form.healtd_insurance || ''}
                                            onChange={handleChange} />
                                    </td>
                                </tr>
                                <br />
                                <tr>
                                    <th>Địa chỉ liên lạc tại Việt Nam</th>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='province'>Tỉnh thành</label>
                                    </td>
                                    <td>
                                        <input
                                            type='text'
                                            name='province'
                                            value={form.province || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.province}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='district'>Quận /huyện</label>
                                    </td>
                                    <td>
                                        <input
                                            type='text'
                                            name='district'
                                            value={form.district || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.district}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='ward'>Phường /xã</label>
                                    </td>
                                    <td>
                                        <input
                                            type='text'
                                            name='ward'
                                            value={form.ward || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.ward}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='number_address'>Số nhà, phố, tổ dân phố /thôn /đội</label>
                                    </td>
                                    <td>
                                        <input
                                            type='text'
                                            name='number_address'
                                            value={form.number_address || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.number_address}</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label htmlFor='phone'>Điện thoại</label>
                                    </td>
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
                                    <td>
                                        <label htmlFor='email'>Email</label>
                                    </td>
                                    <td>
                                        <input
                                            type='text'
                                            name='email'
                                            value={form.email || ''}
                                            onChange={handleChange} />
                                        <p className='error'>{errors.email}</p>
                                    </td>
                                </tr>
                                <br />
                                <tr>
                                    <td>
                                        <label className='traveled' htmlFor='traveled'>Trong vòng 14 ngày qua, Anh /Chị có đến quốc gia /vùng lãnh thổ nào (Có thể đi qua nhiều quốc gia)</label>
                                    </td>
                                    <td>
                                        <textarea
                                            name='traveled'
                                            value={form.traveled || ''}
                                            onChange={handleChange} />
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label className='symptom' htmlFor='symptom'>Trong vòng 14 ngày qua, Anh /Chị có thấy xuất hiện dấu hiệu nào sau đây không?</label>
                                    </td>
                                    <td>
                                        <input
                                            type='checkbox'
                                            name='symptom'
                                            value={'Sốt'} /> Sốt
                                        <br />
                                        <input
                                            type='checkbox'
                                            name='symptom'
                                            value={'Ho'} /> Ho
                                        <br />
                                        <input
                                            type='checkbox'
                                            name='symptom'
                                            value={'Khó thở'} /> Khó thở
                                        <br />
                                        <input
                                            type='checkbox'
                                            name='symptom'
                                            value={'Viêm phổi'} /> Viêm phổi
                                        <br />
                                        <input
                                            type='checkbox'
                                            name='symptom'
                                            value={'Đau họng'} /> Đau họng
                                        <br />
                                        <input
                                            type='checkbox'
                                            name='symptom'
                                            value={'Mệt mỏi'} /> Mệt mỏi
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label className='contacted' htmlFor='contacted'>Trong vòng 14 ngày qua, Anh /Chị có tiếp xúc với?</label>
                                    </td>
                                    <td>
                                        <input
                                            type='checkbox'
                                            name='contacted'
                                            value={'Nghi ngờ'} /> Sốt
                                        <br />
                                        <input
                                            type='checkbox'
                                            name='contacted'
                                            value={'Đến từ nước có bệnh'} /> Ho
                                        <br />
                                        <input
                                            type='checkbox'
                                            name='contacted'
                                            value={'Có biểu hiện bệnh'} /> Khó thở
                                    </td>
                                </tr>
                                <br />
                                <tr>
                                    <td colSpan={2}>
                                        <button type='submit' onClick={handleSubmit}>Submit</button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </form>
                )}
            </Formik>
        </div>
    );
}