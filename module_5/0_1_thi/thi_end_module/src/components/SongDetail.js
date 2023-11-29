
const SongDetail = ({ song }) => {
  
  if (!song) {
    return null
  }

  return (
    <>
      <table border={3}>
        <tr>
          <h1>{song.name}</h1>
          <h3>{song.singer}</h3>
        </tr>
      </table>
    </>
  )
}

export default SongDetail