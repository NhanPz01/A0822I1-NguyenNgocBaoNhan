import avt from '../asset/avt.jpg'
export default function ProfileCard() {
  return (
    <>
      <div className="vh-100">
        <div className="container py-5 h-100">
          <div className="row d-flex justify-content-center align-items-center h-100">
            <div className="col col-md-9 col-lg-7 col-xl-5">
              <div className="card">
                <div className="card-body p-4">
                  <div className="d-flex text-black">
                    <div className="flex-shrink-0">
                      <img src={avt} alt={"Avatar placeholder"}/>
                    </div>
                    <div className="flex-grow-1 ms-3">
                      <h5 className="mb-1">Nguyễn Ngọc Bảo Nhân</h5>
                      <p className="mb-2 pb-1" style={{color: '#2b2a2a'}}>CNTT - ĐH Bách Khoa Đà Nẵng</p>
                      <div className="d-flex justify-content-between rounded-3 p-2 mb-2">
                        <div>
                          <p className="small text-muted mb-1">Tuổi</p>
                          <p className="mb-0">20</p>
                        </div>
                        <div className="px-3">
                          <p className="small text-muted mb-1">Giới tính</p>
                          <p className="mb-0">Nam</p>
                        </div>
                        <div>
                          <p className="small text-muted mb-1">Thành phố</p>
                          <p className="mb-0">Đà Nẵng</p>
                        </div>
                      </div>
                      <div className="d-flex pt-1">
                        <button type="button" className="btn btn-outline-primary me-1 flex-grow-1">Liên hệ</button>
                        <button type="button" className="btn btn-primary flex-grow-1"><a href={'https://www.facebook.com/nhan.bao.240703'}>Theo dõi</a></button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  )
}