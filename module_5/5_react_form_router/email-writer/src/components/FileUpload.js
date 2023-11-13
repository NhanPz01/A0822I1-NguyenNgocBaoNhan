import { useField } from "formik";


const FileUpload = ({ fileRef, ...props }) => {
  const [field, meta] = useField(props);
  return (
    <>
      <input ref={fileRef} multiple={true} type="file" {...field} />
      {meta.touched && meta.error ? (
        <div style={{ color: "red" }}>{meta.error}</div>
      ) : null}
    </>
  )
}

export default FileUpload;